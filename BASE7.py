# -*- coding: utf-8 -*-
"""
Created on Tue Sep  5 13:36:28 2017

@author: maxin
"""

class Solution(object):
    def convertToBase7(self, num):
        """
        :type num: int
        :rtype: str
        """
        a = num / 7
        b = num % 7
        
        if a == 0:
            return str(b)
        else:
            return self.convertToBase7(a) + str(abs(b))
            

            

print((-11//7))