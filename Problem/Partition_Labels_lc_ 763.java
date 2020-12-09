package leetCode_amazon;

import java.util.*;

// https://leetcode.com/problems/partition-labels/
public class PartitionLabels {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str1 = new String();
		str1 = sc.next();
		List<Integer> lst =  PartitionLabel(str1); 
		System.out.println(lst.toString());
	}

  //If Input = 'ababcbacadefegdehijhklij'
  //Then o/p = [9, 7, 8]
	private static List<Integer> PartitionLabel(String S) {
		if(S.length() == 0)
			return null;
		
		List<Integer> lst = new ArrayList<Integer>();
		
		int[] lastIndex = new int[26];
		int first = 0, last = 0;
		
		for(int i=0; i < S.length(); i++) {
			lastIndex[S.charAt(i) - 'a'] = i; //This will store last index of all character from the string.
		}
		
		for(int i = first; i < S.length(); i++) {
			last = Math.max(last, lastIndex[S.charAt(i) - 'a']);
			
			if(i == last) {
				lst.add(last - first + 1);
				first = last+1;
			}
		}
		
		return lst;
		
	}
}

