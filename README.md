# Algo Analysis

## Asymptotic Analysis

- Asymptotic Analysis helps in evaluating performance of an algorithm in terms of input size and it's increase.

- Using asymptotic analysis we dpn't measure actual running time of algorithm.

- It helps in determining how time and space taken by algorithm increases with input size.

- Asymptotic Notations are the mathematical tools used to describe the running time of an algorithm in terms of input size.


### Type of Asymptotic Notation

- There are three notations for performing runtime analysis of an algorithm
    - Omega (Ω) Notation
    - Big O (O) Notation
    - Theta (ϴ) Notation

## Omega (Ω) Notation

- It is the formal way to express the lower bound of an algorithm's running time.
- Lower bound means for any given input this notation determines best amount of time an algorithm can take to complete.

- For example:
    - If we say certain algorithm takes 100 secs as best amount of time. So, 100 secs will be lower bound of that algorithm. The algorithm can take more than 100 secs but it will not take less than 100 secs.

## Big O (O) Notation

- It is the formal way to express the upper bound of an algorithm's running time.
- Upper bound means for any given input this notation determines longest amount of time an algorithm can take to complete.
- For example:
    - If we say certain algorithm takes 200 secs as longest amount of time. So, 100 secs will be upper bound of that algorithm. The algorithm can take less than 100 secs but it will not take more than 100 secs.

## Theta (ϴ) Notation

- It is the formal way to express both the upper and lower bound of an algorithm's running time.
- By lower and upper bound means for any given input this notation determines average amount of time an algorithm can take to complete.
- For example:
    - If we run certain algorithm and it takes 100 secs for the first run, 120 sec for seconds run, 110 for third run and so on. So, theta notations gives average of running time of that algorithm. 