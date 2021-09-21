package models;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String s="abbc";
        List<String> myList = new ArrayList<>(Arrays.asList(s.split("")));
        System.out.println(myList);
    }
}