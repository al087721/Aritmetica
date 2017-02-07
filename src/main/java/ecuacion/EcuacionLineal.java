package ecuacion;

/**
 * Created by al087721 on 07/02/2017.
 */
public class EcuacionLineal implements Ecuacion {

        double a;
        double b;
        public EcuacionLineal(double a, double b){
            this.a=a;
            this.b=b;
        }
        public EcuacionLineal(){
            super();
        }
        @Override
        public double ResuelveLineal(double a, double b) {
            //ax+b=0
            //Despejar x -> ax=-b, x=-b/a
            return (-b / a);
        }
}
