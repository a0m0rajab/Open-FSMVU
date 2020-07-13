#include <stdio.h>

int my_func(int n1, int n2);

int main(void)
{
    int x1, x2, x3, x4, y;

    printf("No1: ");
    scanf("%d", &x1);

    printf("No2: ");
    scanf("%d", &x2);


    y = my_func(x1,x2);
    printf("Result: %d\n", y);
    return 0;
}
