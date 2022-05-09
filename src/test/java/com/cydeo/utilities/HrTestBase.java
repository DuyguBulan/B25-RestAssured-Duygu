package com.cydeo.utilities;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class HrTestBase {

    //beforeAll is the same thing with beforeClass in testng
    @BeforeAll
    public static void init() {
        RestAssured.baseURI = "http://3.82.205.143:1000/ords/hr";

    }
}
