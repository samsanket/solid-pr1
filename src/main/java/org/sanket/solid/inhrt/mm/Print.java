package org.sanket.solid.inhrt.mm;


import java.awt.*;
import java.io.IOError;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

class Second{
    public Object print() throws IOError  {
        return "0";
    }
}
public class Print extends Second {
    public String print() throws IllegalComponentStateException {
        return "1";
    }

    public static void main(String[] args) throws IOException {
        Second print= new Second();
        System.out.println(print.print());

    }
}
