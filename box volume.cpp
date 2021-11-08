#include <iostream>
using namespace std;
class box {

    double length=0;
    double breadth=0;
    double height=0;
   public:
    void initData(double len, double brth, double hgt) {
        length = len;
        breadth = brth;
        height = hgt;
    }
    double len()
    {return length;}
    double brth()
    {return breadth;}
    double hgt()
    {return height;}
    double calculateArea() {
        return length * breadth;
    }
    double calculateVolume() {
        return length * breadth * height;
    }
};
int main() {
	double length,breadth,height;
    box box1;
    cout<<"Enter the length, breadth and height of the box"<<endl;
    cin>>length;
    cin>>breadth;
    cin>>height;
    box1.initData(length,breadth,height);
    cout << "Length of box=  " << box1.len() << endl;
    cout << "Breadth of box=  " << box1.brth() << endl;
    cout << "Height of box=  " << box1.hgt() << endl;
    cout << "Area of box =  " << box1.calculateArea() << endl;
    cout << "Volume of box =  " << box1.calculateVolume() << endl;
    return 0;
}
