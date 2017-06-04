//#include<iostream>
#include<stdio.h>
#include<math.h>
#include<stdlib.h>
#include<string.h>
//#include<algorithm>
//using namespace std;
/*The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.*/
/*计算两个数的哈密顿距离
哈密顿距离定义如下：
	两个数转换成2进制，比较每一bit，距离为相同的bit的个数。
	例如：
		1（0001）
		2（0100）
		第一位和第三位不同，则哈密顿距离为2*/
/*解题思路：
	我们发现位运算^功能和本题描述很像，于是我们只要数x^y有几个bit是1就可以了*/		
		 
class Solution {
public:
    int hammingDistance(int x, int y) {
        int ans=0;
        int ansSequence=x^y;
        while(ansSequence){
            if(ansSequence&1) ans++;
            ansSequence>>=1;
        }
        return ans;
    }
};
