/*Problem-1
Question 5: Find the homeless 
Problem Statement -:  There are N Homeless people in the community and N houses in the community. It will be given in the array (people), the height of the person, and in the array house capacity of the house is given.
The government decided to give homes to people on the basis of the following conditions:
•	Priority is given to the people from left to right of the array
•	Each person is allotted to a house if and only if the capacity of the house is greater than or equal to the person’s height
•	Nearby empty Houses are allotted to the person( starting from the extreme left)
You need to find the number of homeless people who have not been allotted any home if the government follows the above conditions. So that government will have an idea of how many people they need to allot homes for next time.
Constraints:
•	1 <= N <= 10^3
•	1 <= people[i] <= 10^5
•	1 <= house[i] <= 10^5
Input Format for Custom Testing:
•	The first line contains an integer, N, denoting the number of  people and number of houses.
•	Each line i of the N subsequent lines (where 0 <= i <= N) contains an integer describing peoplei.
•	Each line i of the N subsequent lines (where 0 <= i <= N) contains an integer describing housei.
Sample Test Cases
•	Sample Input 1
3  
4
2
7
3
5
10
•	Sample Output 1
0
•	Explanation
people=[4,2,7]
house=[3,5,10]
People[0] has more priority , from left to right order in houses 5 is the nearest one which fits for people[0]
people[1]=2 will fit in 3 which is nearer from left
people[2]=7 will fit in remaining house of capacity of 10
So no homeless people left so return 0 
•	Sample Input 2
3
3
8
5
1
9
4
•	Sample Output 2
2
•	Explanation
people=[3,8,5]
house=[1,9,4]
people[0]=3 can fit in 9 which is nearest from left in array house
people[1]=8  cannot fit in any home which is left (i.e, 1 and 4)
people[2]=5 cannot fit in any home which is left (i.e, 1 and 4)
So return 2,which is number of homeless people*/

package programs;

import java.util.*;
public class HomeAlocate {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] people = new int[n];
        int[] house = new int[n];
        for(int i =0;i<n;i++)
        {
            people[i]=sc.nextInt();
        }
        for(int i =0;i<n;i++)
        {
            house[i]=sc.nextInt();
        }

        int allot = 0;
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<n;j++)
            {
                if(house[j]>=people[i])
                {
                    allot++;
                    house[j]=0;
                    break;
                }
                else{
                    continue;
                }
            }
        }
        System.out.println(allot);
    }

    
}
