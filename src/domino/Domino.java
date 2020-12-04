package domino;

/**
 *
 * @author jovan
 */
public class Domino {

    public static int pagar(int intentos, int pago) {
        if (intentos != 0) {
            if (pago == 100) {
                pago += 200;
            } else {
                pago = 100;
            }
        }
        return pago;
    }

    public static void main(String[] args) {

        double intervalo;
        double probFicha;
        double calificacion = 0;
        double porcentajeAprobacion;
        double porcentajeReprobacion;
        int totalAprobados = 0;
        int totalReprobados = 0;
        int totalMesa = 0;
        int totalAlumnos;
        int aprobados = 0;
        int reprobados = 0;
        int pago = 0;
        int mesa = 0;
        int alumno;
        int intento;
        boolean pasa = false;
        int[] salones = {25};
        int intentoUno = 0;
        int intentoDos = 0;
        int intentoTres = 0;

        for (int salon = 0; salon < salones.length; salon++) {
            for (alumno = 0; alumno < salones[salon]; alumno++) {
                for (intento = 0; intento < 3 && !pasa; intento++) {
                    intervalo = Math.random() * (4 / 28d - 0);
                    probFicha = Math.random() * (1 - 0) + 0;
                    pago = pagar(intento, pago);
                    if (intervalo > 0 && intervalo <= 1 / 28d) {
                        if (probFicha > 0 && probFicha <= 1 / 4d) {
                            System.out.println("Saco la ficha: 0,0");
                            calificacion = 0;
                        }
                        if (probFicha > 1 / 4d && probFicha <= 2 / 4d) {
                            System.out.println("Saco la ficha: 1,0");
                            calificacion = 8.3;
                        }
                        if (probFicha > 2 / 4d && probFicha <= 3 / 4d) {
                            System.out.println("Saco la ficha: 6,5");
                            calificacion = 91.6;
                            pasa = true;
                        }
                        if (probFicha > 3 / 4d && probFicha <= 1) {
                            System.out.println("Saco la ficha: 6,6");
                            calificacion = 100;
                            pasa = true;
                        }
                    } else if (intervalo > 1 / 28d && intervalo <= 2 / 28d) {
                        if (probFicha > 0 && probFicha <= 1 / 8d) {
                            System.out.println("Saco la ficha: 1,1");
                            calificacion = 16.6;
                        }
                        if (probFicha > 1 / 8d && probFicha <= 2 / 8d) {
                            System.out.println("Saco la ficha: 2,0");
                            calificacion = 16.6;
                        }
                        if (probFicha > 2 / 8d && probFicha <= 3 / 8d) {
                            System.out.println("Saco la ficha: 2,1");
                            calificacion = 25;
                        }
                        if (probFicha > 3 / 8d && probFicha <= 4 / 8d) {
                            System.out.println("Saco la ficha: 3,0");
                            calificacion = 25;
                        }
                        if (probFicha > 4 / 8d && probFicha <= 5 / 8d) {
                            System.out.println("Saco la ficha: 5,4");
                            calificacion = 75;
                            pasa = true;
                        }
                        if (probFicha > 5 / 8d && probFicha <= 6 / 8d) {
                            System.out.println("Saco la ficha: 6,3");
                            calificacion = 75;
                            pasa = true;
                        }
                        if (probFicha > 6 / 8d && probFicha <= 7 / 8d) {
                            System.out.println("Saco la ficha: 5,5");
                            calificacion = 83.3;
                            pasa = true;
                        }
                        if (probFicha > 7 / 8d && probFicha <= 1) {
                            System.out.println("Saco la ficha: 6,4");
                            calificacion = 83.3;
                            pasa = true;
                        }
                    } else if (intervalo > 2 / 28d && intervalo <= 3 / 28d) {
                        if (probFicha > 0 && probFicha <= 1 / 12d) {
                            System.out.println("Saco la ficha: 2,2");
                            calificacion = 33.3;
                        }
                        if (probFicha > 1 / 12d && probFicha <= 2 / 12d) {
                            System.out.println("Saco la ficha: 3,1");
                            calificacion = 33.3;
                        }
                        if (probFicha > 2 / 12d && probFicha <= 3 / 12d) {
                            System.out.println("Saco la ficha: 4,0");
                            calificacion = 33.3;
                        }
                        if (probFicha > 3 / 12d && probFicha <= 4 / 12d) {
                            System.out.println("Saco la ficha: 3,2");
                            calificacion = 41.6;
                        }
                        if (probFicha > 4 / 12d && probFicha <= 5 / 12d) {
                            System.out.println("Saco la ficha: 4,1");
                            calificacion = 41.6;
                        }
                        if (probFicha > 5 / 12d && probFicha <= 6 / 12d) {
                            System.out.println("Saco la ficha: 5,0");
                            calificacion = 41.6;
                        }
                        if (probFicha > 6 / 12d && probFicha <= 7 / 12d) {
                            System.out.println("Saco la ficha: 4,3");
                            calificacion = 58.3;
                        }
                        if (probFicha > 7 / 12d && probFicha <= 8 / 12d) {
                            System.out.println("Saco la ficha: 5,2");
                            calificacion = 58.3;
                        }
                        if (probFicha > 8 / 12d && probFicha <= 9 / 12d) {
                            System.out.println("Saco la ficha: 6,1");
                            calificacion = 58.3;
                        }
                        if (probFicha > 9 / 12d && probFicha <= 10 / 12d) {
                            System.out.println("Saco la ficha: 4,4");
                            calificacion = 66.6;
                        }
                        if (probFicha > 10 / 12d && probFicha <= 11 / 12d) {
                            System.out.println("Saco la ficha: 5,3");
                            calificacion = 66.6;
                        }
                        if (probFicha > 11 / 12d && probFicha <= 1) {
                            System.out.println("Saco la ficha: 6,2");
                            calificacion = 66.6;
                        }
                    } else if (intervalo > 3 / 28d && intervalo <= 4 / 28d) {
                        if (probFicha > 0 && probFicha <= 1 / 4d) {
                            System.out.println("Saco la ficha: 3,3");
                            calificacion = 50;
                        }
                        if (probFicha > 1 / 4d && probFicha <= 2 / 4d) {
                            System.out.println("Saco la ficha: 4,2");
                            calificacion = 50;
                        }
                        if (probFicha > 2 / 4d && probFicha <= 3 / 4d) {
                            System.out.println("Saco la ficha: 5,1");
                            calificacion = 50;
                        }
                        if (probFicha > 3 / 4d && probFicha <= 1) {
                            System.out.println("Saco la ficha: 6,0");
                            calificacion = 50;
                        }
                    }
                }

                switch (intento) {
                    case 1:
                        intentoUno++;
                        break;
                    case 2:
                        intentoDos++;
                        break;
                    case 3:
                        intentoTres++;
                        break;
                }
                if (pasa) {
                    aprobados++;
                } else {
                    reprobados++;
                }
                System.out.printf("Alumno: %d\nCalificacion: %.2f\nPago: $%d Intentos: %d\n" + (pasa ? "APROBADO" : "REPROBADO") + "\n\n", (alumno + 1), calificacion, pago, intento);
                pasa = false;
                mesa += pago;
                pago = 0;
            }
            totalAprobados += aprobados;
            totalReprobados += reprobados;
            totalMesa += mesa;
            System.out.printf("Salon %d\nAprobados: %d\nReprobados: %d\nLa mesa se llevo: $%d\n\n", (salon + 1), aprobados, reprobados, mesa);
            aprobados = 0;
            reprobados = 0;
            mesa = 0;
        }
        totalAlumnos = totalReprobados + totalAprobados;
        porcentajeAprobacion = ((double) totalAprobados / totalAlumnos) * 100;
        porcentajeReprobacion = ((double) totalReprobados / totalAlumnos) * 100;
        System.out.printf("Alumnos que pasaron al \nPrimer intento: %d\nSegundo intento: %d\nTercer Intento: %d\n\n", intentoUno, intentoDos, intentoTres);
        System.out.printf("Porcentaje de Aprobacion: %c%.2f\nPorcentaje de Reprobacion: %c%.2f\nTotal mesa: %d\n", '%', porcentajeAprobacion, '%', porcentajeReprobacion, totalMesa);
    }
}
