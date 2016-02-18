arr = Array.new
f = File.open(ARGV[0])
limit = Integer(f.gets)
f.each_line do |line|
  arr << line
end
f.close
arr = arr.sort_by {|str| str.length}
for i in 1..limit
  puts arr[-i]
end
