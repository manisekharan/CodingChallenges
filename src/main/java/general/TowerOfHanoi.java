package general;

public class TowerOfHanoi
{
    public static void main(String args[])
    {
        int numOfDisks = 2;
        new TowerOfHanoi().moveDisks(numOfDisks, 'A', 'B', 'C');
    }

    void moveDisks(int n, char source_pole, char destination_pole, char helper_pole)
    {
        if (n == 1)
        {
            System.out.println("Move disk 1 from pole " +  source_pole + " to pole " + destination_pole);
            return;
        }
        moveDisks(n-1, source_pole, helper_pole, destination_pole);
        System.out.println("Move disk " + n + " from pole " +  source_pole + " to pole " + destination_pole);
        moveDisks(n-1, helper_pole, destination_pole, source_pole);
    }
}

/*
Graphic Representation
                            TOH(2, A, B, C)
                            /           \
                TOH(1, A, C, B)         TOH(1, C, B, A)
In order,

Move disk 1 from pole A to pole C
Move disk 2 from pole A to pole B
Move disk 1 from pole C to pole B

Time Complexity : O(2 Power n)

M(1) = 1
M(2) = 2M(1) + 1 = 3
M(3) = 2M(2) + 1 = 7
M(4) = 2M(3) + 1 = 15
M(5) = 2M(4) + 1 = 31
M(n) = 2 power of n + 1


Space Complexity: O(n)

Here time complexity is exponential but space complexity is linear

 */