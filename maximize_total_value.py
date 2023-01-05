n = 5
s = [1, 5, 10, 11, 13]
f = [6, 11, 12, 21, 14]
diff = []
for i in range(n):
  val = f[i]-s[i]
  diff.append(val)
print(diff)