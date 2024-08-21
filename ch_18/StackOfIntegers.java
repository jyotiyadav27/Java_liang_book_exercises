pubic class StackOfIntegers{
    private int size;
    private int[] elements;

    public static final DEFAULT_CAPACITY = 20;

    public StackOfIntegers(){
        this(DEFAULT_CAPACITY);
    }
    public StackOfIntegers(int capacity){
        elements = new int[capacity];
    }

    public void push(int value){
        if(size>=elements.length);
        {
            int[] temp = new int[elements.length*2];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements = temp;
        }
        elements[size++]=value;

    }
    public int peek(){
        return elements[size-1];
    }
    public int pop(){
        return elements[--size];
    }
    public boolean empty(){
        return size==0;
    }

}