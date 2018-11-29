package org.nmu.sa.davydova.labOne;

public class labOne {
    public static void main(String[] args) {
        //Размер массива
        int nrow=7, ncol=7;
        
        //Инициализация массива
        int[][] matrix=new int[nrow][ncol];
        
        //Заполнение массива числами
        for(int i=0; i<nrow;i++)
            for(int j=0;j<ncol;j++)
                matrix[i][j]=i+j;
        
        //Вывод массива на экран
        System.out.println("Исходная матрица: ");
        for(int i=0; i<nrow;i++){
            for(int j=0;j<ncol;j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }
        System.out.println();
        
        //Сумма всех элементов
        int sum=0;
        for(int i=0; i<nrow;i++)
            for(int j=0;j<ncol;j++)
                sum=sum+matrix[i][j];
        System.out.println("Сумма элементов равняется "+sum);
        
        //Поиск максимального элемента двумя способами
        //Первый способ
        int max_element=0, max_element_2=0;
        for(int i = 0;i<nrow;i++)
            for(int j=0;j<ncol;j++){
                if(matrix[i][j]>max_element)max_element=matrix[i][j];
            }
        
        //Второй способ
        for(int i = 0;i<nrow;i++)
            for(int j=0;j<ncol;j++)
                max_element_2=Math.max(max_element_2, matrix[i][j]);
                
        System.out.println("Максимальный элемент: " + max_element+" - первым способом, "+max_element_2+" - вторым способом");
    
        //Поиск минимального элемента двумя способами
        //Первый способ
        int min_element=2147483647, min_element_2=2147483647; //Верхний интервал int
        for(int i = 0;i<nrow;i++)
            for(int j=0;j<ncol;j++){
                if(matrix[i][j]<min_element)min_element=matrix[i][j];
            }
        
        //Второй способ
        for(int i = 0;i<nrow;i++)
            for(int j=0;j<ncol;j++)
                min_element_2=Math.min(min_element_2, matrix[i][j]);
                
        System.out.println("Минимальный элемент: " + min_element+" - первым способом, "+min_element_2+" - вторым способом");
        
    }
}
