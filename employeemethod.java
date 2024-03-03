private static void searchEmployee() {
        System.out.print("Enter employee ID to search: ");
        int searchId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (Employee employee : employees) {
            if (employee.getId() == searchId) {
                System.out.println("Employee found:");
                System.out.println("Name: " + employee.getName() + ", ID: " + employee.getId() + ", Department: " + employee.getDepartment() +
                        ", Designation: " + employee.getDesignation() + ", Address: " + employee.getAddress() +
                        ", Phone Number: " + employee.getPhoneNumber() + ", Join Date: " + employee.getJoinDate() + ", Leaving Date: " + employee.getLeavingDate());
                return;
            }
        }
        System.out.println("Employee not found with ID: " + searchId);
    }
