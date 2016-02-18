sum = 0
File.open(ARGV[0]).each_line do |line|
  sum += Integer(line)
end
puts sum