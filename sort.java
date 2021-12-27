class Sort
{
    public static void main (String[] args)
    {
        int a[] = {16, 19, 11, 15, 10, 12, 14};
        
        for(int j = 0; j<a.length; j++)
        {
            //initially swapped is false
            boolean swapped = false;
            int i = 0;
            while(i<7-1)
            {
                //comparing the adjacent elements
                if (a[i] > a[i+1])
                {
                    //swapping
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    //Changing the value of swapped
                    swapped = true;
                }
                i++;
            }
            //if swapped is false then the array is sorted
            //we can stop the loop
            if (!swapped)
                break;
        }

        for(int x : a)
        {
            System.out.println(x);
        }

    }
}
