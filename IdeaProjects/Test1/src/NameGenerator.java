import java.util.ArrayList;
import java.util.Random;

public class NameGenerator {
    public NameGenerator() {
        generator_ = new Random();

        jmena_ = new ArrayList<String>();
        prijmeni_ = new ArrayList<String>();
        czech_domains_ = new ArrayList<String>();
        english_domains_ = new ArrayList<String>();
        phone_codes_ = new ArrayList<String>();

        jmena_.add("Mirek");
        jmena_.add("Karel");
        jmena_.add("Stanislav");
        jmena_.add("Borec");
        jmena_.add("Karlos");
        jmena_.add("Otakar");
        jmena_.add("Premysl");
        jmena_.add("Cestmir");
        jmena_.add("Ctibor");
        jmena_.add("Libor");
        jmena_.add("Pribor");
        jmena_.add("Sebastian");
        jmena_.add("Gerd");
        jmena_.add("Zbynek");
        jmena_.add("Anna");
        jmena_.add("Lanna");
        jmena_.add("Stepanka");
        jmena_.add("Romana");
        jmena_.add("antonin");
        jmena_.add("Tony");
        jmena_.add("Ladislav");
        jmena_.add("Ladis");
        jmena_.add("Bretislav");
        jmena_.add("Otto");
        jmena_.add("Tereza");
        jmena_.add("Christie");
        jmena_.add("Amber");
        jmena_.add("Johny");
        jmena_.add("Jan");
        jmena_.add("David");
        jmena_.add("Devj");
        jmena_.add("Mustafa");
        jmena_.add("Ahmed");
        jmena_.add("Jakub");
        jmena_.add("Martin");
        jmena_.add("Martinek");
        jmena_.add("Marian");
        jmena_.add("Marcel");
        jmena_.add("Hodoslav");
        jmena_.add("Bohuslav");
        jmena_.add("Honimir");
        jmena_.add("Kazimir");
        jmena_.add("Bretislav");
        jmena_.add("Kvetoslav");
        jmena_.add("Bronislav");
        jmena_.add("Fili");
        jmena_.add("Kili");
        jmena_.add("Ondrejko");
        jmena_.add("Milik");
        jmena_.add("Miloslav");









        prijmeni_.add("Burda");
        prijmeni_.add("Benda");
        prijmeni_.add("Keprt");
        prijmeni_.add("Minin");
        prijmeni_.add("Drda");
        prijmeni_.add("Drd");
        prijmeni_.add("Trn");
        prijmeni_.add("Tasewski");
        prijmeni_.add("Kvitinic");
        prijmeni_.add("Petar");
        prijmeni_.add("Ivanovic");
        prijmeni_.add("Bazkovic");
        prijmeni_.add("Busko");
        prijmeni_.add("Barda");
        prijmeni_.add("Adam");
        prijmeni_.add("Pavel");
        prijmeni_.add("Brnos");
        prijmeni_.add("Cactus");
        prijmeni_.add("Mikula");
        prijmeni_.add("Picahra");
        prijmeni_.add("Sourek");
        prijmeni_.add("Sourkova");
        prijmeni_.add("Zubar");
        prijmeni_.add("Zubarikova");
        prijmeni_.add("Vatech");
        prijmeni_.add("Vatechova");
        prijmeni_.add("Nemec");
        prijmeni_.add("Nemcova");
        prijmeni_.add("Nemeckova");
        prijmeni_.add("Cerny");
        prijmeni_.add("Cerny");
        prijmeni_.add("Bohous");
        prijmeni_.add("Novotny");
        prijmeni_.add("Petiprsty");
        prijmeni_.add("Korenorez");

        czech_domains_.add("email");
        czech_domains_.add("seznam");
        czech_domains_.add("centrum");
        czech_domains_.add("post");
        czech_domains_.add("libimseti");

        english_domains_.add("gmail");
        english_domains_.add("hotmail");
        english_domains_.add("global");
        english_domains_.add("mail");

        phone_codes_.add("608");
        phone_codes_.add("776");
        phone_codes_.add("605");
        phone_codes_.add("603");
        phone_codes_.add("777");
    }

    public Person getRandomPerson() {
        Person person = new Person();
        String name = nahodneJmeno();
        String surname = nahodnePrijmeni();
        person.setName_(name);
        person.setSurname_(surname);
        person.setEmail_(getEmail(name, surname));
        person.setPhone_number_(generatePhoneNumber());
        return person;
    }

    private String nahodneJmeno() {
        int index = generator_.nextInt(jmena_.size() - 1);
        return jmena_.get(index);
    }

    private String nahodnePrijmeni() {
        int index = generator_.nextInt(prijmeni_.size() - 1);
        return prijmeni_.get(index);
    }

    private String getEmail(String jmeno, String prijmeni) {
        String domain;
        String country_sign;
        if (generator_.nextInt(3) < 2) {
            int index = generator_.nextInt(czech_domains_.size() - 1);
            domain = czech_domains_.get(index);
            country_sign = ".cz";
        } else {
            int index = generator_.nextInt(english_domains_.size() - 1);
            domain = english_domains_.get(index);
            country_sign = ".com";
        }

        String suffix = "";
        if (generator_.nextBoolean()) {
            suffix = new String(new Integer(generator_.nextInt(EMAIL_NUM)).toString());
        }

        String delimiter = "";
        if (generator_.nextBoolean()) {
            delimiter = ".";
        }

        return new String(jmeno.toLowerCase() + delimiter + prijmeni.toLowerCase() + suffix + "@" + domain + country_sign);
    }

    private String generatePhoneNumber() {
        String phone_number = phone_codes_.get(generator_.nextInt(phone_codes_.size() - 1));

        for (int i = 0; i < 6; i++) {
            Integer number = new Integer(generator_.nextInt(9));
            phone_number += number.toString();
        }

        return phone_number;
    }

    private Random generator_;

    private ArrayList<String> jmena_;
    private ArrayList<String> prijmeni_;

    private ArrayList<String> czech_domains_;
    private ArrayList<String> english_domains_;
    private ArrayList<String> phone_codes_;

    private final int EMAIL_NUM = 999;
}