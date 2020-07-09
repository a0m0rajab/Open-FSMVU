function paginationControl(num) {
  clearTable()
     /**
      * Get the search pages number - check get pages functions to understand it.
      */
     let numberOfPages = getPages()
     /**
      * Check the desired page feasability. 
      * if less then zero then we should show the first page.
      * if its larger than the results length then it will show the last number of pages.
      * else it will be used without modification
      */
     if (num < 0) dataIndex = 0;
     else if (num > numberOfPages) dataIndex = numberOfPages;
     else dataIndex = num;
     /**
      * Set the chosen page view for the user, added one to show numbers starting from 1 not 0.
      */
     setPagesView()
     /** min is the number of first verse to show based on the chosen page, which it should be the desiredPage multiplied by the number of verses in a page. 
      * if the minum number is 
      */
     // dataIndex = num <= 0 ? 0 : (Math.ceil(dataArr.length / verseInPage) <= num) ? num : Math.ceil(dataArr.length / verseInPage);
     let min = dataIndex * verseInPage >= dataArr.length ? dataArr.length - dataArr.length % verseInPage : dataIndex * verseInPage;
     /** max is the number of the last verse to show based on the minimum number which it's min+desired number of verses. But needed small modification to overcome errors */
     let max = min + verseInPage >= dataArr.length ? dataArr.length + 0 : min + verseInPage;
     /** if any error occuered then we can se them to defaults, the eror occuers cause of one page */
     if (isNaN(min)) min = 0;
     if (isNaN(max)) max = dataArr.length;
   addVerse(min,max)
     /**start the needed functions */
     addShowFunction();
     menuFn();
     initPagination();
     /** if pages is less than one then we dont have to show it. */
     if (getPages() < 1) {
hidePagination()
     } else {
showPagination()
     }
 }