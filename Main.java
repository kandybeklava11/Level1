import java.util.*;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //////////////////////////////////////////////////////1
/*
                List<Student> students = Arrays.asList(
                        new Student("Alice", 1),
                        new Student("Bob", 2),
                        new Student("Charlie", 1),
                        new Student("David", 3),
                        new Student("Eve", 2),
                        new Student("Frank", 1)
                );

                Map<Integer, List<Student>> studentsByCourse = students.stream()
                        .collect(Collectors.groupingBy(Student::getCourse));

                studentsByCourse.forEach((course, studentList) -> {
                    System.out.println("Course " + course + ":");
                    studentList.forEach(student -> System.out.println(student.getName()));
                    System.out.println();
                });

 */

        //////////////////////////////////////////////////////////////////2
        /*
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> evenAndOddNumbers = numbers.stream()
                .collect(Collectors.partitioningBy(number -> number % 2 == 0));

        List<Integer> evenNumbers = evenAndOddNumbers.get(true);
        List<Integer> oddNumbers = evenAndOddNumbers.get(false);

        System.out.println("Четные числа: " + evenNumbers);
        System.out.println("Нечетные числа: " + oddNumbers);

         */
        /////////////////////////////////////////////////////////////////3

        /*
                List<Person> people = Arrays.asList(
                        new Person("Alice", 25),
                        new Person("Bob", 30),
                        new Person("Charlie", 20),
                        new Person("David", 35),
                        new Person("Eve", 28)
                );

                Optional<Person> oldestPerson = people.stream()
                        .max(Comparator.comparingInt(Person::getAge));

                oldestPerson.ifPresent(person -> System.out.println("Самый старый человек: " + person.getName()));
         */
        /////////////////////////////////////////////////////////////////4
      /*
        List<Student3> students = Arrays.asList(
                new Student3("Alice", 165),
                new Student3("Bob", 175),
                new Student3("Charlie", 160),
                new Student3("David", 180),
                new Student3("Eve", 170)
        );

        // Вычисление среднего роста студентов
        OptionalDouble averageHeight = students.stream()
                .mapToInt(Student3::getHeight)
                .average();

        // Вывод результата
        double average = averageHeight.orElse(0.0);
        System.out.println("Средний рост студентов: " + average);
    }

       */
//////////////////////////////////////////////////////////////////////////5
         /*
        List<Student2> students = Arrays.asList(
                new Student2("Alice", 90),
                new Student2("Bob", 80),
                new Student2("Charlie", 95),
                new Student2("David", 85),
                new Student2("Eve", 92)
        );

        List<Student2> sortedStudents = students.stream()
                .sorted(Comparator.comparingInt(Student2::getGrade).reversed())
                .collect(Collectors.toList());

        System.out.println("Список студентов, отсортированный по оценкам:");
        sortedStudents.forEach(student -> System.out.println(student.getName() + " - " + student.getGrade()));
    }

         */
        ///////////////////////////////////////////////////////////////////6
        /*
        List<DocumentPage> documentPages = Arrays.asList(
                new DocumentPage(1, "Содержимое страницы 1"),
                new DocumentPage(2, "Содержимое страницы 2"),
                new DocumentPage(3, "Содержимое страницы 3"),
                new DocumentPage(4, "Содержимое страницы 4"),
                new DocumentPage(5, "Содержимое страницы 5")
        );

        List<DocumentPage> selectedPages = documentPages.stream()
                .skip(1)
                .limit(2)
                .collect(Collectors.toList());

        System.out.println("Выбранные страницы:");
        selectedPages.forEach(page -> System.out.println("Страница " + page.getPageNumber() + ": " + page.getContent()));

         */
        /////////////////////////////////////////////////////////////////////7
        /*
        List<Student> students = Arrays.asList(
                new Student("Alice", 90),
                new Student("Bob", 80),
                new Student("Charlie", 95),
                new Student("David", 85),
                new Student("Eve", 92)
        );


        Set<String> studentNames = students.stream()
                .map(Student::getName)
                .collect(Collectors.toSet());


        System.out.println("Множество имён студентов:");
        studentNames.forEach(System.out::println);
    }
         */
        ///////////////////////////////////////////////////////////////////////8
        /*
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35),
                new Person("David", 40),
                new Person("Eve", 45)
        );


        Map<String, Integer> peopleMap = people.stream()
                .collect(Collectors.toMap(Person::getName, Person::getAge));


        System.out.println("Отображение с именами и возрастами людей:");
        peopleMap.forEach((name, age) -> System.out.println(name + " - " + age));
    }

         */
        //////////////////////////////////////////////////////////////////////9
      /*
        List<Student> students = Arrays.asList(
                new Student("Alice", 90),
                new Student("Bob", 80),
                new Student("Charlie", 95),
                new Student("David", 85),
                new Student("Eve", 92)
        );
        String names = students.stream()
                .map(Student::getName)
                .collect(Collectors.joining(", "));

        System.out.println("Имена студентов: " + names);
    }

       */
        ////////////////////////////////////////////////////////////////////////10
    /*
        List<Student4> students = Arrays.asList(
                new Student4("Alice", 1, 20),
                new Student4("Bob", 2, 22),
                new Student4("Charlie", 1, 21),
                new Student4("David", 3, 23),
                new Student4("Eve", 2, 20)
        );


        Map<Integer, Map<Integer, List<Student4>>> studentsByCourseAndAge = students.stream()
                .collect(Collectors.groupingBy(Student4::getCourse,
                        Collectors.groupingBy(Student4::getAge)));


        System.out.println("Студенты по курсу и возрасту:");
        studentsByCourseAndAge.forEach((course, studentsByAge) -> {
            System.out.println("Курс " + course + ":");
            studentsByAge.forEach((age, studentList) -> {
                System.out.println("  Возраст " + age + ":");
                studentList.forEach(student -> System.out.println("    " + student.getName()));
            });
        });
    }

     */
        ///////////////////////////////////////////////////////////////////////11
        /*
        List<String> sentences = Arrays.asList(
                "This is a sample sentence",
                "Another sentence with more words",
                "One more sentence for testing"
        );

        List<String> wordsWithMoreConsonants = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split("\\s+")))
                .filter(word -> countConsonants(word) > countVowels(word))
                .collect(Collectors.toList());

        System.out.println("Words with more consonants than vowels:");
        wordsWithMoreConsonants.forEach(System.out::println);
    }

    private static long countConsonants(String word) {
        return word.toLowerCase().chars()
                .filter(ch -> "bcdfghjklmnpqrstvwxyz".contains(String.valueOf((char) ch)))
                .count();
    }

    private static long countVowels(String word) {
        return word.toLowerCase().chars()
                .filter(ch -> "aeiou".contains(String.valueOf((char) ch)))
                .count();

         */
        ////////////////////////////////////////////////////////////////////////12
        /*
        List<String> sentences = Arrays.asList(
                "This is a sample sentence",
                "Another sentence with more words",
                "One more sentence for testing"
        );

        List<String> wordsWithMoreConsonants = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split("\\s+")))
                .filter(Main::hasMoreConsonants)
                .collect(Collectors.toList());

        System.out.println("Words with more consonants than vowels:");
        wordsWithMoreConsonants.forEach(System.out::println);
    }

    private static boolean hasMoreConsonants(String word) {
        return countConsonants(word) > countVowels(word);
    }

    private static long countConsonants(String word) {
        return word.toLowerCase().chars()
                .filter(ch -> "bcdfghjklmnpqrstvwxyz".contains(String.valueOf((char) ch)))
                .count();
    }

    private static long countVowels(String word) {
        return word.toLowerCase().chars()
                .filter(ch -> "aeiou".contains(String.valueOf((char) ch)))
                .count();
    }

         */
        ////////////////////////////////////////////////////////////////////////13
        /*
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");

        Set<String> uniqueWords = words.stream()
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println("Unique words:");
        uniqueWords.forEach(System.out::println);

         */
        }

    }



