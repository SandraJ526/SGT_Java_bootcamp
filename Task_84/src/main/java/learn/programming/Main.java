package learn.programming;

import org.xembly.Directives;
import org.xembly.ImpossibleModificationException;
import org.xembly.Xembler;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try {

            Note note1 = new Note("note", "to", "Tove", "from", "Jani",
                    "heading", "Reminder",
                    "body", "Don't forget me this weekend!");

            var noteFile =
                    new Xembler(
                            new Directives().add(note1.getNote())
                                    .add(note1.getTo()).set(note1.getRecipient()).up()
                                    .add(note1.getFrom()).set(note1.getSender()).up()
                                    .add(note1.getHeading()).set(note1.getHeadingName()).up()
                                    .add(note1.getNoteBody()).set(note1.getBodyMessage()).up()
                    ).xml();

            File file = new File("C:\\tmp\\note.xml");

            try {
                FileWriter writer = new FileWriter(file);
                writer.write(noteFile);
                writer.flush();
                writer.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (ImpossibleModificationException e) {
            e.printStackTrace();
        }
    }
}
