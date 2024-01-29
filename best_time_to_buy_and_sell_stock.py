prices=[7,1,5,6,3]


def stock(prices):
    min_price=prices[0]
    max_prof=0
    for price in prices:
        max_prof=max(max_prof,price-min_price)
        min_price=min(min_price,price)
    return max_prof

max_prof=stock(prices)
print(max_prof)
