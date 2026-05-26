class Solution:
    def numberOfSpecialChars(self, word: str) -> int:

        st = set()

        for ch in word:
            st.add(ch)

        count = 0

        for ch in word:

            if ch.islower():

                upper = ch.upper()

                if upper in st:
                    count += 1

                    st.remove(upper)

        return count