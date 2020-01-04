# Fred's Fancy Fencing

Fred the farmer is trying to layout fencing for his animals

## Description
Fred the farmer laying out fencing to enclose his animals to make sure that they don't end up wondering into the ponds around his property. He makes sure to make it so that the area that is enclosed by his fencing is maximizing all of his land, so he made some pretty odd shapes when laying out the fence. Fred first marked the perimeter of his land, careful to avoid any water. He also had to make sure to enclose the ponds that are in the middle of his farm land. He wants you to figure out how many square feet of land the animals can wonder around in.


## Input

You will be given a what the property looks like from above. Fencing is shown by "#", while any blank space could be either land or a pond. You can assume that the land starts in the upper left corner, (if the upper left most fencing is position (0,0), then the land starts at position (1,1)). 

The dimensions of the property will be of size x by y. 
## Constraints

$$ 9 \leq x \leq 60 $$
$$ 9 \leq y \leq 60 $$

## Output

Print the amount of square feet that the animals will be able to wonder in. 

## Sample Input 0

```
#############
#           #
#    ####   #
#    #  #   #
#    ####   #
#           #
#           #
#           #
#############

```
## Sample Output 0

```
65
```

### Explanation 0

Here is all of the land that the animals are able to walk on (shown by "a" just for this example). The number of a's is 65, so the answer is 65.   
```
#############
#aaaaaaaaaaa#
#aaaa####aaa#
#aaaa#  #aaa#
#aaaa####aaa#
#aaaaaaaaaaa#
#aaaaaaaaaaa#
#aaaaaaaaaaa#
#############
```
## Sample Input 1

```
#################################
#                               #
#    ####             ####  #####
#    #  #             #  #  #
#    ####             #  #  #####
#                     ####      #
###################             #
                  ###############

```
## Sample Output 1

```
128
```

### Explanation 1

Here is all of the land that the animals are able to walk on (shown by "a" just for this example). The number of a's is 128, so the answer is 128.
```
#################################
#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#
#aaaa####aaaaaaaaaaaaa####aa#####
#aaaa#  #aaaaaaaaaaaaa#  #aa#
#aaaa####aaaaaaaaaaaaa#  #aa#####
#aaaaaaaaaaaaaaaaaaaaa####aaaaaa#
###################aaaaaaaaaaaaa#
                  ###############
```