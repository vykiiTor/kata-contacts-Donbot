package info.dmerej.contacts;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ContactsGenerator {
  public Stream<Contact> generateContacts(int count) {
    // TODO: generate a *lot* of contacts instead of just 3
    return IntStream.range(0, count)
            .mapToObj(i -> {
              String name = "JOE" + i; // Example name format
              String domain = "example.com"; // Example domain
              String email = "email-" + i + "@" + domain;
              return new Contact(name, email);
            });
  }
}
