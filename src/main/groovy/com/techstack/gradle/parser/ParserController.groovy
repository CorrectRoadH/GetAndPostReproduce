package com.techstack.gradle.parser

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

class ParseRequestBody {
    String content;
}

class PackageDep {
    String name;
    String version;
}

@RestController
class ParserController {

    @GetMapping("parse")
    public String getParse() {
        return "GET"
    }


    @PostMapping("parse")
    public String postParse() {
        return "POST";
    }
}
