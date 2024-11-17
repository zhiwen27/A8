# A8 Card Sorting

# Your readme should include the following information. Each student needs to submit all of this information themselves, even when pair programming. 

## General Information
Programming Partner Name (if you'd like to be graded together): No.

Other Collaborators (and kudos to helpful members of the class): Yuyao Zhu, she points me to a better way of iterating through the elements of CardPile using for(card: CardPile) instead of using get methods, which greatly improves the efficiency of my codes.

Any references used besides JavaDoc and course materials:
Course Material: PPT 15 - Intro to Sorting Algorithms     PPT 16 - Sorting Continued
## Assignment Reflection

What did you notice about the differences in runtime across algorithms as you changed the number of cards you were sorting? If you had to split them into "slower" algorithms vs "faster" algorithms, which would you put in each category?
Results:
10000 cards: Merge Sort: 0.09s Insertion Sort: 0.31s Selection Sort: 0.29s
20000 cards: Merge Sort: 0.10s Insertion Sort: 0.93s Selection Sort: 0.94s
40000 cards: Merge Sort: 0.11s Insertion Sort: 3.24s Selection Sort: 3.40s
80000 cards: Merge Sort: 0.19s Insertion Sort: 13.36s Selection Sort: 13.74s
160000 cards: Merge Sort: 0.26s Insertion Sort: 55.23s Selection Sort: 55.43s
I noticed that Merge Sort takes (much) less time in general, with Insertion Sort taking roughly the same (slightly less) time as Selection sort. This might agree with the efficiencies of three sorting algorithms, as Merge Sort has efficiency of n*log(n), and Insertion Sort has efficiency of n^2 on average, with best case having efficiency n and worst case having efficiency n^2, and Selection Sort has efficiency n^2.
We might noticed when doubling the sample size, the efficiency of Selection and Insertion Sort roughly doubles, and efficiency of Merge Sort increases on a log scale. We might also noticed the behavior of Insertion Sort would depend on how randomly the cards are organized (and varies slightly from O(n^2) behavior).
I would put Merge Sort into faster algorithm category. I would put Insertion Sort and Selection Sort into slower algorithm category.

Please reflect on your experience with this assignment. What was most challenging? What was most interesting?
The process of thinking through each sorting method is challenging (but referring to course materials is really helpful), also, thinking about how to improve the efficiency of the program is challenging. I think the part when we can see the demonstration of sorting process is really interesting, also, seeing how the experimented results would agree with theory is also really interesting.