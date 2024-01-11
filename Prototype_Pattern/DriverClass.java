package Prototype_Pattern;

import java.net.ProxySelector;

public class DriverClass {
    public static void main(String[] args) {

        //Creating Prototype documents
        Letter letter = new Letter("Sample Letter content","David Beckham","Jason Grace");
        Report report = new Report("Sample Report content","James Patterson","VictoryLap");
        Presentation presentation = new Presentation("Sample Presentation content",23);

        //Creating new documents by cloning the prototypes
        //Creating a duplicate object with the same state of the original object
        Letter newLetter = letter.clone();
        Report newReport = report.clone();
        Presentation newPresentation = presentation.clone();

        newLetter.setContent("Modified Letter content");
        newReport.setAuthor("Luke Castellan");
        newPresentation.setSlideCount(20);

        //Printing the details of the cloned objects
        System.out.println("Letter: Type: " + newLetter.getType() + " Content: " + newLetter.getContent()+" Sender: "+newLetter.getSender()+" Recipient: "+newLetter.getRecipient());
        System.out.println("Report: Type: " + newReport.getType() + " Content: " + newReport.getContent()+" Author: "+newReport.getAuthor()+" Title: "+newReport.getTitle());
        System.out.println("Presentation: Type: " + newPresentation.getType() + " Content: " + newPresentation.getContent()+" Slide Count: "+newPresentation.getSlideCount());
    }
}
/*
In conclusion, the Prototype Design Pattern allows for efficient object creation by cloning existing objects. It offers advantages like reduced overhead, customizable objects, and simplified creation.
 Its usage in software engineering simplifies code, promotes reusability, and leads to more efficient solutions.
 The Prototype Pattern is particularly useful in scenarios where you have a set of similar objects that differ only in a few properties or configurations. It can be beneficial when:
1. The cost of creating a new object is expensive, such as when database or network calls are involved.
2. You need to support a large number of different configurations or states for an object.
3. You want to isolate the object creation and cloning logic from the client code.
 */
