def fib1_recursive(n, cache = {})
  if n == 0 || n == 1
    return n
  end
  cache[n] = fib1_recursive(n-1, cache) + fib1_recursive(n-2, cache)
end

arr = [0, 5, 10, 24]
arr.each { |n|
  puts fib1_recursive n
}
