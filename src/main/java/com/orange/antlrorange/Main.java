package com.orange.antlrorange;

import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.*;

import com.orange.antlrorange.JSONParser.*;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * @author Jimbo McJimbo
 */
class Main {
   private static void testFile(String fileName){
      if(fileName.charAt(0) != '/'){
         fileName = "/" + fileName;
      }
      try {
         ///Get the file as an InputStream
         InputStream inputStream = Main.class.getResourceAsStream(fileName);
         //Create the Lexer
         Lexer lexer = new JSONLexer(CharStreams.fromStream(inputStream));
         //Create a TokenStream on the Lexer
         TokenStream tokenStream = new CommonTokenStream(lexer);
         //make a Parser on the token stream
         JSONParser parser = new JSONParser(tokenStream);
         //get the top node of the AST.
         JsonContext context = parser.json();
         if(parser.getNumberOfSyntaxErrors() <= 0){
            System.out.printf("[PASSED] %s is a JSON file.%n", fileName);
         } else {
            System.out.printf("[FAILED] %s is NOT a JSON file.%n", fileName);
         }
      } catch (IOException e){
         System.out.println("[ERROR] Invalid file");
      }
   }
   public static void main(String[] args) {
      System.out.println("AntlrOrange");

      testFile("/example1.txt");
      testFile("/example2.txt");
   }
}