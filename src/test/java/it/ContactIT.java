package it;

import com.mongodb.client.MongoClients;
import com.snappbox.contact.ContactApplication;
import io.restassured.RestAssured;
import jdk.nashorn.internal.objects.Global;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static io.restassured.RestAssured.given;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Import(EmbeddedMongoAutoConfiguration.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = ContactApplication.class)
public class ContactIT {

    @LocalServerPort
    String port;
@Autowired
    MongoOperations mongoOperation;
    String createData;

    @BeforeAll
    public void init() {
        RestAssured.port = Integer.valueOf(port);
        RestAssured.baseURI = "localhost:8585/snapbox/resources";
        this.mongoOperation= new MongoTemplate(MongoClients.create(), "test");
        String path = this.getClass().getClassLoader().getResource("dataset/CreateContact.json").getPath();

        JSONObject jsonObject= (JSONObject) new JSONParser(path, Global.instance(),false).parse();

    }

    @Test
    public void create() {
        given().basePath("/contact").header("Content-Type","application/json").body(createData).post().then().statusCode(201);
    }

}
