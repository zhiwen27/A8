# A8 Card Sorting

# Your readme should include the following information. Each student needs to submit all of this information themselves, even when pair programming. 

## General Information
Programming Partner Name (if you'd like to be graded together): No.

Other Collaborators (and kudos to helpful members of the class): No.

Any references used besides JavaDoc and course materials:
Course Material: PPT 15 - Intro to Sorting Algorithms     PPT 16 - Sorting Continued
## Assignment Reflection

What did you notice about the differences in runtime across algorithms as you changed the number of cards you were sorting? If you had to split them into "slower" algorithms vs "faster" algorithms, which would you put in each category?
Results for random cards (I used a smaller sample size as I felt like it was taking a comparatively longer time):
2000 cards: Merge Sort: 0.06s Insertion Sort: 0.57s Selection Sort: 1.09s
5000 cards: Merge Sort: 0.07s Insertion Sort: 8.33s Selection Sort: 17.32s
10000 cards: Merge Sort: 0.09s Insertion Sort: 104.83s Selection Sort: 140.46s
I noticed that Merge Sort takes (much) less time in general, with Insertion Sort taking medium time and Selection sort taking the longest time. This might agree with the efficiencies of three sorting algorithms, as Merge Sort has efficiency of n*log(n), and Insertion Sort has efficiency of n^2 on average, with best case having efficiency n and worst case having efficiency n^2, and Selection Sort has efficiency n^2. We might noticed the behavior of Insertion Sort depends on how randomly the cards are organized.
I would put Merge Sort into faster algorithm category. I would put Insertion Sort (as it gets slower to larger sample sizes) and Selection Sort into slower algorithm category.

Please reflect on your experience with this assignment. What was most challenging? What was most interesting?
The process of thinking through each sorting method is challenging (but referring to course materials is really helpful). I think the part when we can see the demonstration of sorting process is really interesting.