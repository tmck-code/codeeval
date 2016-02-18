File.open(ARGV[0]).each_line do |n|
  f0 = 0
  f1 = 1
  fn = 0
  n = Integer(n)
  if n == 0; puts f0; next; end
  if n == 1; puts f1; next; end
  i = 1
  while i < n
    tmp = f0 + f1
    f0 = f1
    fn = tmp
    f1 = fn
    i += 1
  end
  puts fn
end