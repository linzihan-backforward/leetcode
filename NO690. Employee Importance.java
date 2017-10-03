/**You are given a data structure of employee information, which includes the employee's unique id, his importance value and his direct subordinates' id.

For example, employee 1 is the leader of employee 2, and employee 2 is the leader of employee 3. They have importance value 15, 10 and 5, respectively. Then employee 1 has a data structure like [1, 15, [2]], and employee 2 has [2, 10, [3]], and employee 3 has [3, 5, []]. Note that although employee 3 is also a subordinate of employee 1, the relationship is not direct.

Now given the employee information of a company, and an employee id, you need to return the total importance value of this employee and all his subordinates.
 * 题意：给你一个公司的上下级关系，是一个树形结构，让你算一个人及其下属的val值之和。
 * 思路：按照树形结构搜索即可，注意处理两层的list结构。
 */
/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int ans=0;
        for( Employee e:employees){
            if(e.id==id){
                ans+=e.importance;
                for(int i=0;i<e.subordinates.size();i++)
                    ans+=getImportance(employees,e.subordinates.get(i)+0);
            }
        }
        return ans;
    }
}