class Test_myVector{
    public static void main(String[] args){
        myVector<Integer> vect = new myVector<Integer>();
        myVector<Integer> vect2;
        
        System.out.println("Создание массива");
        for(int i=0; i<30; i++){
            vect.append(i);
        }
        System.out.println("Кол-во эл-тов: "+vect.get_csize());
        System.out.println(vect);
        
        System.out.println("\n\nКопирование массива");
        try{
            vect2 = new myVector<Integer>(vect);
            System.out.println(vect2);
            System.out.println("\nОчистить");
            vect2.clear();
            System.out.println("Проверка: "+vect2.get_csize());
        }catch(VectorException e){
            System.out.println(e.getMessage());
        }
        
        try{
            System.out.println("\nУдалить первые и последние 10 эл-тов");
            for(int i=0; i<10; i++){
                vect.remove_index(0);
                vect.remove_last();
            } 
            System.out.println(vect);
            System.out.println("\nДобавить эл-т 13 на 7 место");
            vect.append_in_index(13, 7);
            System.out.println(vect);
        }catch(VectorException e){
            System.out.println(e.getMessage());
        }

    }
}
