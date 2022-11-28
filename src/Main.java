public class Main {
    public static void main(String[] args) {
        Employee[] arr = new Employee[10];
        arr[0] = new Employee("Андрей Михайлови", "ИТ", 300_000);
        arr[1] = new Employee("Наталия Ивановна", "ИТ", 350_000);
        arr[2] = new Employee("Гузалия Толгатовна", "ИТ", 390_000);
        arr[3] = new Employee("Анастасия Андреевна", "ИТ", 320_000);
        arr[4] = new Employee("Михаил Александрович", "ЧС", 345_000);
        arr[5] = new Employee("Галина Александровна", "ЧС", 310_000);
        arr[6] = new Employee("Сергей Сергеевич", "ФИН", 350_000);
        arr[7] = new Employee("Евгений  Владимирович", "ФИН", 390_000);
        arr[8] = new Employee("Ствен  Хоккинг", "ССТ", 450_000);
        arr[9] = new Employee("Бил Гейтс ", "ЭК", 500_000);
        allPrint(arr);
        System.out.println("Сумма затрат на зарплаты в месяц " + getSumSalaryOnMonth(arr) + " рублей");
        System.out.println("Сотрудник с максимальной зарплатой - " + getEmployeeWithMaxSalary(arr));
        System.out.println("Сотрудник с минимальной зарплатой - " + getEmployeeWithMinSalary(arr));
        System.out.println("Среднее значение зарлат = " + getAverageSalary(arr) + " рублей");
        printName(arr);
    }

    // 1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
    public static void allPrint(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // 2. Посчитать сумму затрат на зарплаты в месяц.
    public static int getSumSalaryOnMonth(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    //   3. Найти сотрудника с минимальной зарплатой.
    public static String getEmployeeWithMinSalary(Employee[] employees) {
        String result = "";
        int minSalary = 100000;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                result = employees[i].getName();
            }
        }
        return result;
    }

    //    4. Найти сотрудника с максимальной зарплатой.
    public static String getEmployeeWithMaxSalary(Employee[] employees) {
        String result = "";
        int maxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                result = employees[i].getName();
            }
        }
        return result;
    }

    //    5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
    public static int getAverageSalary(Employee[] employees) {
        int result = getSumSalaryOnMonth(employees) / employees.length;
        return result;
    }

    //    Получить Ф. И. О. всех сотрудников (вывести в консоль).
    public static void printName(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
        }
    }
}