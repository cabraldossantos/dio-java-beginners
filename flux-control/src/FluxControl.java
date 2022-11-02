public class FluxControl {
    public static void main(String[] args) throws Exception {
        ifArrow();
        ifWithoutArrow();
        ifVacation();
        ifSmaller();

        switchWeek();
        switchNumber();
        switchVacation();
    }

    private static void ifArrow() {
        int mounth = 7;
        if (mounth == 1) {
            System.out.println("Janeiro");
        } else {
            if (mounth == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mounth == 3) {
                    System.out.println("Março");
                } else {
                    if (mounth == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mounth == 5) {
                            System.out.println("Maio");
                        } else {
                            if (mounth == 6) {
                                System.out.println("Junho");
                            } else {
                                if (mounth == 7) {
                                    System.out.println("Julho");
                                } else {
                                    if (mounth == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (mounth == 9) {
                                            System.out.println("Setembro");
                                        } else {
                                            if (mounth == 10) {
                                                System.out.println("Outubro");
                                            } else {
                                                if (mounth == 11) {
                                                    System.out.println("Novembro");
                                                } else {
                                                    if (mounth == 12) {
                                                        System.out.println("Dezembro");
                                                    } else {
                                                        System.out.println("Mês indefinido");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static void ifWithoutArrow() {
        int mounth = 12;
        if (mounth == 1) {
            System.out.println("Janeiro");
        } else if (mounth == 2) {
            System.out.println("Fevereiro");
        } else if (mounth == 3) {
            System.out.println("Março");
        } else if (mounth == 4) {
            System.out.println("Abril");
        } else if (mounth == 5) {
            System.out.println("Maio");
        } else if (mounth == 6) {
            System.out.println("Junho");
        } else if (mounth == 7) {
            System.out.println("Julho");
        } else if (mounth == 8) {
            System.out.println("Agosto");
        } else if (mounth == 9) {
            System.out.println("Setembro");
        } else if (mounth == 10) {
            System.out.println("Outubro");
        } else if (mounth == 11) {
            System.out.println("Novembro");
        } else if (mounth == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Mês indefinido");
        }
    }

    private static void ifVacation() {
        String mounth = "julho";
        if (mounth == "julho" || mounth == "dezembro" || mounth == "janeiro") {
            System.out.println("Férias");
        }
    }

    private static void ifSmaller() {
        double monthlySalary = 11893.58d;
        double averageSalary = 10500d;
        int numberOfDependents = 4;
        int averageOfDependents = 2;
        if ((monthlySalary < averageSalary) && (numberOfDependents >= averageOfDependents)) {
            System.out.println("Funcionário deve receber auxílio.");
        }

        boolean lowPay = monthlySalary < averageSalary;
        boolean manyDependents = numberOfDependents >= averageOfDependents;
        if ((lowPay) && (manyDependents)) {
            System.out.println("Funcionário deve receber auxílio.");
        }

        boolean receiveHelp = (lowPay) && (manyDependents);
        if (receiveHelp) {
            System.out.println("Funcionário deve receber auxílio.");
        } else {
            System.out.println("Funcionário não deve receber auxílio.");
        }
    }

    private static void switchWeek() {
    String day = "Quinta";
        switch (day) {
            case "Domingo":
                System.out.println(1);
                break;
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
                break;
            default:
                System.out.println("Valor indefinido.");
                break;
        }
    }

    private static void switchNumber() {
        int number = 5;
        switch (number) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor não definido.");
                break;
        }
    }

    private static void switchVacation() {
        String mounth = "dezembro";
        switch (mounth) {
            case "janeiro":
            case "julho":
            case "dezembro":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Mês indefinido.");
                break;
        }
    }
}
