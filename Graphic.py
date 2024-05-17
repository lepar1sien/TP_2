import matplotlib.pyplot as plt

import numpy as np


x = [10, 100, 1000, 10000, 100000, 1000000]
y = [1082200, 20500, 136100, 1356300, 8693600, 2057200]

plt.figure(figsize=(10, 10))
plt.title('Время вычисления минимума в зависимости от количества чисел.', fontsize=15)
plt.xlabel('Количество чисел.', fontsize=20)
plt.ylabel('Время выполнения.', fontsize=20)
plt.plot(x, y)
plt.xlim(-10000, 100000)
plt.ylim(-1000, 9000600)
plt.grid()
plt.scatter(x, y)
plt.show()

x = [10, 100, 1000, 10000, 100000, 1000000]
y = [17900, 18100, 177900, 1338500, 10025400, 1809800]

plt.figure(figsize=(10, 10))
plt.title('Время вычисления максимума в зависимости от количества чисел.', fontsize=15)
plt.xlabel('Количество чисел.', fontsize=20)
plt.ylabel('Время выполнения.', fontsize=20)
plt.plot(x, y)
plt.xlim(-10000, 1000000)
plt.ylim(-100000, 15000000)
plt.grid()
plt.scatter(x, y)
plt.show()

x = [10, 100, 1000, 10000, 100000, 1000000]
y = [192400, 111300, 1109600, 4018300, 19400900, 64728900]

plt.figure(figsize=(10, 10))
plt.title('Время вычисления суммы в зависимости от количества чисел.', fontsize=15)
plt.xlabel('Количество чисел.', fontsize=20)
plt.ylabel('Время выполнения.', fontsize=20)
plt.plot(x, y)
plt.xlim(-100000, 1000000)
plt.ylim(-10000, 70000000)
plt.grid()
plt.scatter(x, y)
plt.show()

x = [10, 100, 1000, 10000, 100000, 1000000]
y = [85700, 615800, 2552500, 80626400, 4135947400, 571547795400]

plt.figure(figsize=(10, 10))
plt.title('Время вычисления произведения в зависимости от количества чисел.', fontsize=15)
plt.xlabel('Количество чисел.', fontsize=20)
plt.ylabel('Время выполнения.', fontsize=20)
plt.plot(x, y)
plt.xlim(-100000, 1000000)
plt.ylim(-100000000, 590000000000)
plt.grid()
plt.scatter(x, y)
plt.show()