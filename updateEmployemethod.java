 private static void updateEmployeeDetails() {
        System.out.print("Enter employee ID to update details: ");
        int updateId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (Employee employee : employees) {
            if (employee.getId() == updateId) {
                System.out.print("Enter new department: ");
                String newDepartment = scanner.nextLine();
                employee.setDepartment(newDepartment);
                System.out.print("Enter new designation: ");
                String newDesignation = scanner.nextLine();
                employee.setDesignation(newDesignation);
                System.out.print("Enter new address: ");
                String newAddress = scanner.nextLine();
                employee.setAddress(newAddress);
                System.out.print("Enter new phone number: ");
                String newPhoneNumber = scanner.nextLine();
                employee.setPhoneNumber(newPhoneNumber);
                System.out.print("Enter new leaving date (if applicable, else leave blank): ");
                String newLeavingDate = scanner.nextLine();
                employee.setLeavingDate(newLeavingDate);
                System.out.println("Employee details updated successfully.");
                return;
            }
        }
        System.out.println("Employee not found with ID: " + updateId);
    }
