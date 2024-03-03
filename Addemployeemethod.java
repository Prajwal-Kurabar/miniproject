private static void addEmployee() {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter employee department: ");
        String department = scanner.nextLine();
        System.out.print("Enter employee designation: ");
        String designation = scanner.nextLine();
        System.out.print("Enter employee address: ");
        String address = scanner.nextLine();
        System.out.print("Enter employee phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter join date (YYYY-MM-DD): ");
        String joinDate = scanner.nextLine();
        Employee employee = new Employee(name, id, department, joinDate, address, designation, phoneNumber);
        employees.add(employee);
        System.out.println("Employee added successfully.");
    }
