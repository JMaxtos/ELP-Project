load $1 to doc
setid=doc.id
elp=doc.course[0]
pacredits=doc.course[1].credits
total=doc.course#
ids=doc.course->code
credits=doc.course->credits++
save xml to $2