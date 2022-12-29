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


           jmena_.add("Elena");
           jmena_.add("Pavel");
           jmena_.add("filip");
        jmena_.add("Natasha");
        jmena_.add("Jana");
        jmena_.add("Mariana");
        jmena_.add("Michailo");
        jmena_.add("Timur");
        jmena_.add("Petr");
        jmena_.add("Fedor");
        jmena_.add("Nikita");
        jmena_.add("Natalia");
        jmena_.add("Annastasia");
        jmena_.add("Anatolij");
        jmena_.add("Anton");
        jmena_.add("Mariana");
        jmena_.add("Aria");
        jmena_.add("Maksim");





           prijmeni_.add("Visockaja");
        prijmeni_.add("Manishek");
        prijmeni_.add("Simalenko");
        prijmeni_.add("Smircnoff");
        prijmeni_.add("Smirnoff");
        prijmeni_.add("Dobrovolskaja");
        prijmeni_.add("Gordinskij");
        prijmeni_.add("Potoki");
        prijmeni_.add("Vysockij");
        prijmeni_.add("Zelenova");
        prijmeni_.add("Zelenskij");
        prijmeni_.add("Chutnnovski");
        prijmeni_.add("CHenkov");
        prijmeni_.add("Chernovski");
        prijmeni_.add("Pavlovic");
        prijmeni_.add("Bulunovic");
        prijmeni_.add("Kyznovic");
        prijmeni_.add("Kazmovic");
        prijmeni_.add("Bondorev");
        prijmeni_.add("Ashanskaja");
        prijmeni_.add("Zacharov");
        prijmeni_.add("Zacharova");
        prijmeni_.add("Dorbjanskij");
        prijmeni_.add("Zaitsev");
        prijmeni_.add("Fedorovna");
        prijmeni_.add("Klitschko");
        prijmeni_.add("Klicko");
        prijmeni_.add("Voskiva");
        prijmeni_.add("Kukunetz");
        prijmeni_.add("Dudrijeva");
        prijmeni_.add("Maratova");
        prijmeni_.add("Galkinkovij");
        prijmeni_.add("Parskji");
















            czech_domains_.add("srovnejto");
        czech_domains_.add("srovnejto");
        czech_domains_.add("srovnejto");
        czech_domains_.add("srovnejto");
        czech_domains_.add("srovnejto");



            english_domains_.add("srovnejto");
        english_domains_.add("srovnejto");
        english_domains_.add("srovnejto");
        english_domains_.add("srovnejto");
        english_domains_.add("srovnejto");
        english_domains_.add("srovnejto");
            english_domains_.add("volny");

            english_domains_.add("post");

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
                country_sign = ".cz";
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
