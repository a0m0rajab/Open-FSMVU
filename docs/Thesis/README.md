# Thesis Kuran Rehberi 

At this page I am gonna talk about the Thesis writing, program and my self reflection 
[Bahis Qurani](/BahisQurani)

## introduction 

At this thesis I have explained my work at BahisQurani program during the last year 

Here i will have a few short list of my work and how I improved it, my self reflection and even some of the files and pictures that I have used for this thesis. 

I will exaplin few tools that helped me as well; to make it easier for other users in the future to write their thesis better and even grow up from my work. 

I would highly suggest anyone who has any kind of feedback to open an issue for that to communicate together or even reach me through anyway they find suitable for them. 

## writing my Thesis 

I will tell you about my journey during writing my thesis in hope that will help you to understand how it went and overcome the obstacles, learn from my mistakes as well. First I will explain the results of both tries to write the thesis then will explain the twist and list the tools I have used.

### First Rund

I could not have a high quality and good thesis at this time, I hardly wrote 8 pages about my work even though it was for a one semester which means about 3 months of work! The problem for me was having a lack of motivation for writing thesis since i felt like i have done nothing and it was simple, beside that I was not sure of the prupose of my writing! why would I write something that can be explained by code? and for whom I am gonna write? All of those questions remained without a satifying answer for me for a while, even during the second semester... 

### Second Round

At this time I have changed my methodology to write the thesis started by answering the questions that was facing before which answering them helped me to do the job in the way that i like, prefer and even value. Getting to change my ideas and the way I see the thesis came from the idea of "Doing what is right!" instead of just checking few documenatations that does not give the answers to my question.  

### The twist (TL;DR)

Answering the questions by my own helped me to write my thesis, beside that I have written few tools to make my life and thesis writing much easiert - I have explained the tools in the next section - for the question asnwers it was like this: 

**The purpose of writing:** Explaining my work during the year for those who does not know me. 

**The Target readers:** 
Three audience (Programmer, managers, users)

**The users** Are those who needs to know the purpose and the results and how to use the program. 

**managers** are those who deos not want to dive deep in the details about the program and tools i have done but would like to know the main algorthms,  yet they want to know how I have solved the struggles I faced and what I am going to do in the future to improve my work.

**Programmers** are those who want to know the basic programming tools that i have used and how i achieved it, how i used and learn a specific tool and why i used it! for more details I have written and prepared few online documentations for that. 

**What to write?** got solved by checking the target audience and focus on each of them based on their needs 

**What did i do?** GIT really helped me a lot for this <3 

### Writing process

While writing i kept in mind the tools that i have and how to use them, that's why i followed the next steps: 

1. Check my work (Git History)
2. Cluster my work 
   1. Products
   2. Engineering struggles
   3. Programming  
      1. learnt: new things I learnt
      2. practiced: Things i knew but practiced during my this time.
   4. tools (list of used tools)
3. Create outline
4. Explain each point 
5. For images and flowchart I just mentioned them and kept them in highlighted brackets to get back to them later (my approach explained in the tools) 


### Tools 

I decided to list this section to make it easier to check and read. 

#### LaTeX

I fall in love with latex since it makes it easier for you to focus on the writing itself and forget the design. I have used the [overleaf webiste](https://www.overleaf.com/) to generate my latex and take care of few things. 

    
[The template](https://www.overleaf.com/latex/templates/fsmvu-thesis-template/wychkztcsqyp)

When i needed to do any cofniguration i was googling and checking the docs of overleaf to see what can I do.

worth to check: 
- [Figures](https://www.overleaf.com/learn/latex/Positioning_of_Figures)


#### Convertor 

Is a web tool that I have used to overcome the Turkish character problem in latex and make my own specific desgin for pictures instead of struggling with the syntax [the tool](./convertor.html)

Since i have written the tool, it helped me to check it and change the output based on my needs. 

The writing syntax was simple: 

```
# Chapter
## Section 
### Subsection
#### SubSubSection
@foto{link}{caption}  
```

#### Images 

For this I just used to take screenshots of each image based on their place then renamed the whole iamges with increament numbers to make it easier to link them with the latex. 

in the thesis i had them like: 
@foto{foto1.png}{caption}
@foto{foto2.png}{caption}
@foto{foto3.png}{caption}

Then used the [rename shell](./rename.sh) to get the names of the Images 

#### FlowCharts 

For the flow charts I have used **js2flowchart** tool which generate flowcharts based on your javascript code. then used another tool for linux **rsvg-convert** to convert the flowcharts to png and add them to the thesis.

First I have written the whole [codes](./code) then used a [special shell](./convert.sh) (again) to get my desired output.

#### Citations

I have used this [Website](https://www.citationmachine.net/bibtex/cite-a-website) to Auto generate my citations and add them immediately to the latex bib file.
