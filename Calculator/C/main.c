#include <stdio.h>

int main()
{
    int a, b, c, ans;
    scanf("%d %d %d", &a, &b, &c);
    switch(c) {
        case 1:
            ans=a+b;
            break;
        case 2:
            ans=a-b;
            break;
        case 3:
            ans=a/b;
            break;
        case 4:
            ans=a*b;
            break;
    }
    
    printf("%d", ans);
    return 0;
}