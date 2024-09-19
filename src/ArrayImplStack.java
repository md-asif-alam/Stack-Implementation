public class ArrayImplStack {

    public static class Stack{
       private int[] arr=new int[5];
       private int idx=0;

       void push(int x){
           if(isFull()){
               System.out.println("Stack is full");
           }else {
               arr[idx] = x;
               idx++;
           }

       }

       int pop(){
           if(isEmpty()){
               System.out.println("Stack is Empty");
               return -1;
           }
           int top=arr[idx-1];
           arr[idx-1]=0;
           idx--;
           return top;
       }

        int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }

            return arr[idx-1];
        }

        void display(){
           for(int i=0;i<=idx-1;i++){
               System.out.print(arr[i]+" ");
           }
            System.out.println();
        }
        void size(){
            System.out.println(idx);
        }

       boolean isEmpty(){
           if(idx==0){

               return true;
           }
           return false;
       }

       boolean isFull(){
           if(idx==arr.length){

               return true;
           }
           return false;
       }

    }

    public static void main(String[] args) {

        Stack st=new Stack();
        st.push(1);
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.size();
        st.display();//1
        st.push(2);
        st.display();//1.2
        st.size();


        st.push(3);
        st.push(4);

        System.out.println(st.peek());
        st.pop();
        st.display();//1,2,3
        st.size();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(6);
        st.display();

    }
}
