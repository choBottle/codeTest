#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int x1, y1, x2, y2;
    int x3, y3, x4, y4;

    cin >> x1 >> y1 >> x2 >> y2;
    cin >> x3 >> y3 >> x4 >> y4;

    int minX = min(x1, x3);
    int maxX = max(x2, x4);
    int minY = min(y1, y3);
    int maxY = max(y2, y4);

    int width = maxX - minX;
    int height = maxY - minY;

    int side = max(width, height);

    cout << side * side << '\n';

    return 0;
}