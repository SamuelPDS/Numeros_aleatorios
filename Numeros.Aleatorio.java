    public static void main(String[] args) {
     int num = 0;
     int numesc = 0;
     int posicao = 0;
     Random numdinam = new Random();
     num = numdinam.nextInt(59)+1;
     Scanner sc = new Scanner (System.in); {
     ArrayList<Integer> numero  = new ArrayList();
     while (num!=-1)
     {
         System.out.println("Quais numeros voce escolhe? ");
         num = sc.nextInt();
         
         if (num>0) {
         numero.add(num);
         }
         }
         System.out.println(" o numero escolhido foi " +num);
         
        numero.add(num);
       
             
    }
}
