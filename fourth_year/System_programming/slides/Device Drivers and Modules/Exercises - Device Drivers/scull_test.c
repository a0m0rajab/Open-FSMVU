#include <stdio.h>

int main()
{
    FILE* pFile;
    char buffer[10];
    int res;
    pFile = fopen("/dev/scull1", "r");
    res = fread(buffer, 1, 9, pFile);
    printf("Err: %d\n", res);
    printf("%s\n", buffer);
    return 0;
}
