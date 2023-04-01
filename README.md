![CI](https://github.com/teverett/antlr4example/workflows/CI/badge.svg)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/c93d218c4f4f470c9b3fb53a8f4bc626)](https://www.codacy.com/app/teverett/antlr4example?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=teverett/antlr4example&amp;utm_campaign=Badge_Grade)

# antlr4example

A modification of quick Antlr4 Java example.  The example uses antlr4-maven-plugin to compile the grammar [JSON.g4](https://github.com/antlr/grammars-v4/tree/master/json) and parse example json objects, with a slight difference.　Example 1 includes the quote, and Example 2 excludes it, making the object syntactically invalid.
```
{"menu": {  
  "id": "file",  
  "value": "File",  
  "popup": {  
    "menuitem": [
      ̶{̶value": "New", "onclick": "CreateDoc()"},  
      {"value": "Open", "onclick": "OpenDoc()"},  
      {"value": "Save", "onclick": "SaveDoc()"}  
    ]  
  }  
}}
```