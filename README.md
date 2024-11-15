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
2000 cards: Merge Sort: 0.06s Selection Sort: 1.09s Insertion Sort: 1.09s
5000 cards: Merge Sort: 0.07s Selection Sort: 17.32s Insertion Sort: 17.21s
10000 cards: Merge Sort: 0.09s Selection Sort: 140.46s Insertion Sort: 141.85s
I noticed that Merge Sort takes (much) less time in general, with selection sort and insertion sort taking roughly the same time. This might agree with the efficiencies of three sorting algorithms, as Merge Sort has efficiency of n*log(n), Selection Sort has efficiency n^2, and Insertion Sort has efficiency n^2 (on average). We noticed here that insertion sort takes a bit longer than selection sort, which might be that the cards are randomly organized, so the selection sort performs better.
I would put Merge Sort into faster algorithm category and Selection Sort and Insertion Sort into slower algorithm category.

Please reflect on your experience with this assignment. What was most challenging? What was most interesting?
The process of thinking through each sorting method is challenging. I think the part when we can see the demonstration of sorting process is really interesting.