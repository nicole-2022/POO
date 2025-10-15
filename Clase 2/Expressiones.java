public class Expressiones {
    public static void main(String[] args) {
    double d1 = 42.0;
    double d2 = 58.5;
    double d3 = 37.2;
    double t1 = 0.9;
    double t2 = 1.4;
    double t3 = 0.8;
    double l1 = 5.1;
    double l2 = 6.9;
    double l3 = 4.3;
    
    System.out.println("valores:");
    System.out.println(" d1 "+ d1);
    System.out.println("d2= "+ d2);
    System.out.println("d3 = "+d3);
    System.out.println("t1 = "+ t1);

    double resultado = d1 + d2 +d3 + t1 ;
    System.out.println("suma total:" + resultado);
    
    double v1 = d1/ t1;
    double v2 = d2/ t2;
    double v3 = d3/ t3;
    
    double vprom = (d1* v1 + d2 * v2 + d3 * v3 )/ (d1+ d2+ d3);
    
    double kml1 = d1 / l1;
    double kml2 = d2 / l2;
    double kml3 = d3 / l3;

    double kmltotal = (d1 + d2 + d3) / (l1 + l2 + l3);

    System.out.println("v1=" + v1);
    System.out.println( " v2 = " + v2);
    System.out.println (" v3 = " + v3);
    System.out.println("vprom=" + vprom + "km/h");

    System.out.println(" kml1 ="+ kml1);
    System.out.println( " kml2= "+ kml2);
    System.out.println("kml3 =" + kml3);
    System.out.println("kml total: " + kmltotal + " km/L");

    resultado = v1 + v2+ v3+ kml1+ kml2+ kml3 ;
    System.out.println("suma total = " + resultado);

    double precioLitro = 1.35;
    double deprecPorKM = 0.08;

    double p1 = 2.5;
    double p2 = 3.0;
    double p3 = 2.0;

    double costoComb = (l1 + l2 + l3) * precioLitro;
    double deprec =(d1 +d2 +d3) * deprecPorKM;
    double peajes = p1 + p2 + p3;
    double costoDirecto = costoComb + deprec + peajes;
    double costoPorKm = costoDirecto / (d1 + d2+ d3);

    System.out.println("Costo Directo: " + costoDirecto);
    System.out.println("costo por km:" + costoPorKm);
    System.out.println("costo por pasajes:" + peajes);
    System.out.println("costo por deprec:" + deprec);
    System.out.println("costo por comb:" + costoComb);

    double largo = 2.0;
    double ancho = 1.2;
    double alto = 1.1;
    double masaCargaKg = 1200;
    double volCamionM3 = 10;

    double volumenM3 = largo* ancho* alto;
    double densidad = masaCargaKg * volumenM3;
    double ocupacion = volumenM3 * volCamionM3;

    System.out.println("volumen de la carga (m³): " + volumenM3);
    System.out.println("Densidad kg/m³"+ densidad);
    System.out.println("Ocupacion del camion:" + (ocupacion * 100)+ "%");
    
    double fCO2 = 2.31; 

    double COTotal = (l1 + l2 + l3) * fCO2;
    double COporKm = COTotal / (d1 + d2 + d3);

    System.out.println("Emisiones totales de CO2: " + COTotal + " kg");
    System.out.println("Emisiones de CO2 por km: " + COporKm + " kg/km");

    double galPorLitro = 0.264172;

    double vmin = 30;  
    double vmax = 90;

    double v_ms = vprom * 1000.0 / 3600.0; 
    double galTot = (l1 + l2 + l3) * galPorLitro;
    double vnorm = (vprom - vmin) / (vmax - vmin);

    System.out.println("Velocidad promedio en m/s: " + v_ms);
    System.out.println("Galones totales consumidos: " + galTot);
    System.out.println("Velocidad normalizada (0 a 1): " + vnorm);

    double vmedia = (v1 + v2 + v3) / 3.0;
    double sigma = Math.sqrt(
            (Math.pow(v1 - vmedia, 2) + Math.pow(v2 - vmedia, 2) + Math.pow(v3 - vmedia, 2)) / 3.0
        );
    double vpond = (t1 * v1 + t2 * v2 + t3 * v3) / (t1 + t2 + t3);

    System.out.println("Velocidad media: " + vmedia);
    System.out.println("Desviación estándar: " + sigma);
    System.out.println("Velocidad ponderada: " + vpond);

    double va = 40;   
    double ca = 0.05;  
    double vb = 80;  
    double cb = 0.09;  

    double c_vprom = ca + (cb - ca) * (vprom - va) / (vb - va);
    double costoMant = c_vprom * (d1 + d2 + d3);

    System.out.println("C(vprom): " + c_vprom);
    System.out.println("Costo de mantenimiento: " + costoMant);

    double a = -0.008, b = 0.08, c = 4.0; 

    double kmlModelo = a *  Math.pow(vprom, 2) + b * vprom + c;
    double litrosModelo = (d1 + d2 + d3) / kmlModelo;

    System.out.println(" kmlModelo: " + kmlModelo + " km/L");
    System.out.println("LitrosModelo: " + litrosModelo + " L");

    double w1 = 0.25, w2 = 0.25, w3 = 0.25, w4 = 0.25;

    double score = w1 * (1.0 / costoPorKm)
                     + w2 * kmltotal
                     + w3 * (1.0 / Math.pow(COporKm, 2))
                     + w4 * (1.0 / (1.0 + sigma));

    System.out.println("score: " + score);

    }
}